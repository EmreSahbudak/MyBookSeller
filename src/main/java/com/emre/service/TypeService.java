package com.emre.service;

import com.emre.dto.request.SaveTypeRequestDto;
import com.emre.mapper.ITypeMapper;
import com.emre.repository.IJoinTypeBookRepository;
import com.emre.repository.ITypeRepository;
import com.emre.repository.entity.Type;
import com.emre.repository.entity.innerjoin.JoinTypeBook;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class TypeService extends ServiceManager<Type,Long> {

    private final ITypeRepository typeRepository;
    private final IJoinTypeBookRepository typeBookRepository;

    public TypeService(ITypeRepository typeRepository,
                       IJoinTypeBookRepository typeBookRepository) {
        super(typeRepository);
        this.typeRepository = typeRepository;
        this.typeBookRepository = typeBookRepository;
    }
    public void save(SaveTypeRequestDto dto){
        Optional<Type> type=typeRepository.findOptionalByTypeNameIgnoreCase(dto.getTypeName());
        if(type.isEmpty()){
            save(ITypeMapper.INSTANCE.toType(dto));
        }
    }
    public List<JoinTypeBook> enteredTypeBook(String typeName){
        List<JoinTypeBook> bookList=typeBookRepository.enteredTypeBook(typeName);
        if (bookList.isEmpty()){
            throw new NotFoundException("Empty BookList");
        }
        return bookList;
    }

}
